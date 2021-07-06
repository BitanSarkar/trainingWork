const name1 = "Bitan";
const name2 = "Rohit";

const age = 21
console.log("Name 1 : "+name1+" Name 2 : " + name2);
console.log("Name 1 :",name1+" Name 2 :" ,name2);
console.log(`Name 1 : ${name1} Name 2 : ${name2}`);
console.log(`${age>18?"Major":"Minor"}`);

function myFunction(string, p1,p2,p3){
    console.log(string)
    console.log("P1 : ",p1);
    console.log("P2 : ",p2);
    console.log("P3 : ",p3);
}

myFunction `Name 1 ${name1}, Name 2 ${name2}, age is ${age>18?"Major":"Minor"}`

function myRestFunction(type, ...products) {
    console.log(type);
    console.log(products);
}

myRestFunction("Electronics", ["Laptop", "Keyboard", "projector"]);
myRestFunction("Electronics", new Array("Laptop", "Keyboard", "projector"));
myRestFunction("Cosmetics")
myRestFunction `Name 1 ${name1}, Name 2 ${name2}, age is ${age>18?"Major":"Minor"}`;



