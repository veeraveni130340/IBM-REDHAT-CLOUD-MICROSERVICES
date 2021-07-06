const mongoose=require('mongoose');
mongoose.connect('mongodb://localhost/employee',()=>{
    console.log('connection successful');
});
 
/*const courseSchema = new mongoose.Schema({
    name: String,
    author: String, 
    tags: [ String ],
    date: Date, 
    isPublished: Boolean,
    price: Number
  });*/
  const employeeSchema=new mongoose.Schema({
      firstName:String,
      lastName: String,
      email:String
  });
  const Employee=mongoose.model('Employee',employeeSchema)
  //const Course = mongoose.model('Course', courseSchema);
 
  async function getEmployees()
  {
      return await Employee.find();
  }
/*async function getCourses() {
  return await Course
  .find();
}*/
 
async function run() {
  //  const courses = await getCourses();
    //console.log(courses);
    const employees=await getEmployees();
    console.log(employees);
  }
  
  run();
// const mongoose=require('mongoose');
// mongoose.connect('mongodb://localhost/mydb',()=>{
//     console.log('connection successful');
// });
 
// const courseSchema = new mongoose.Schema({
//     name: String,
//     author: String, 
//     tags: [ String ],
//     date: Date, 
//     isPublished: Boolean,
//     price: Number
//   });
//   const Course = mongoose.model('Course', courseSchema);
 
// async function getCourses() {
//   return await Course
//   .find();
// }
 
// async function run() {
//     const courses = await getCourses();
//     console.log(courses);
//   }
  
//   run();