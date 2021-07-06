const mongoose = require('mongoose');
 
mongoose.connect('mongodb://localhost/employee1')
  .then(() => console.log('Connected to MongoDB...'))
  .catch(err => console.error('Could not connect to MongoDB...', err));
 
const Employees = mongoose.model('Employees', new mongoose.Schema({
  first_name: String,
  last_name: String,
  email: String
}));
 
async function createEmployees(first_name, last_name, email) { 
  const employees = new Employees({
    first_name, 
    last_name, 
    email 
  });
 
  const result = await employees.save();
  console.log(result);
}
async function displayEmployees()
{
    return await Employees.find();
    
}
 
async function listEmployees() { 
    const employees = await Employees
      .find()
      .select('first_name');
      console.log(employees);
  }



 
createEmployees('vinni', 'dodda', 'vinni@gmail.com');
 
// createCourse('Node Course', 'authorId')
 
// listCourses();
listEmployees();