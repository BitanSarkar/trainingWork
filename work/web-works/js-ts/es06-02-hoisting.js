hellowWorld();
function hellowWorld() {
    console.log("Hellow World Function");
}
hellowWorld();

let myval;
console.log(myval);

myval = 100;//won't work for variable

console.log(myval);

helloWorld1 = () => {
    console.log("Hello1 World Function");
}
helloWorld1()


//console.log(new Emp()); cannot hoist
class Emp {}
console.log(new Emp());
