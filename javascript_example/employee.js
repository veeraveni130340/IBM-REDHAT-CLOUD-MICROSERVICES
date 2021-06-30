class employee
{
    _firstName;
    _lastName;
    _employeeId;
    _email;

    constructor(_firstName,_lastName,_employeeId,_email)
    {
        this._firstName=_firstName;
        this._lastName=_lastName;
        this._employeeId=_employeeId;
        this._email=_email;
        console.log('within parameter constructor');
    }
    getDetails(){
        return 'Employee ID: '+this._employeeId+' First Name: '+this._firstName+' Last Name: '+this._lastName+' Email: '+this._email;
    }
}
class permanentEmployee extends employee{
    _employeeSal;

    constructor(_employeeSal){
        super('vinita','dodda',100,'vinitha@gmail.com');
        this._employeeSal=_employeeSal
        console.log('permanent constructor');
    
    }
    getDetails(){
        return super.getDetails()+ 'employee sal: '+this._employeeSal;
    }
 }
let emp1=new 

let employee1=new employee('vinni','d','vinni@gmail.com');
console.log(employee1.getDetails());
let employee2=new employee('preethi','pre','preethi@gmail.com');
console.log(employee2.getDetails());

let _cd1=new specialEditionCD('3D');
console.log(_cd1.getDetails());