const mongoose = require('mongoose');
 
mongoose.connect('mongodb://localhost/playground')
  .then(() => console.log('Connected to MongoDB...'))
  .catch(err => console.error('Could not connect to MongoDB...', err));
 
const Author = mongoose.model('Author', new mongoose.Schema({
  name: String,
  bio: String,
  website: String
}));
 
async function createAuthor(name, bio, website) { 
  const author = new Author({
    name, 
    bio, 
    website 
  });
 
  const result = await author.save();
  console.log(result);
}
async function displayAuthors()
{
    return await Author.find();
    
}
 
async function listAuthors() { 
    const authors = await Author
      .find()
      .select('name');
      console.log(authors);
  }



 
createAuthor('A-11', 'My bio-11', 'My Website-11');
 
// createCourse('Node Course', 'authorId')
 
// listCourses();
listAuthors();