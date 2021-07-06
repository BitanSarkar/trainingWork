class Person {
    constructor(name, city="Kolkata"){
        this.name = name;
        this.city = city;
    }
    display() {
        console.log(`Name : ${this.name}`);
        console.log(`City : ${this.city}`);
    }
}
class Employee extends Person{
    constructor(name, empid, city){
        super(name,city);
        this.empid = empid;
    }
    display() {
        console.log(`Name : ${this.name}`);
        console.log(`City : ${this.city}`);
        console.log(`empid: ${this.empid}`);
    }
}
let p = new Employee("Bitan","5fg", undefined);
console.log(p);
p.display();
console.log(typeof p);