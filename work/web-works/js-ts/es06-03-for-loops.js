const names = ["Bitan", "Sanjana", "Prateek"];

for(let i=0; i<names.length; i++) {
    console.log(names[i]);
}

// ------------in or of --------------
console.log("----------------------------------------");
for(const name of names) {
    console.log(name)
}
// ------------in or of --------------
console.log("----------------------------------------");
names.forEach( name => {
    console.log(name);
})

function add(num1, num2){
    return num1+num2;
}

const addResult = (num1, num2) => num1+num2;
let result = add(10,20);
console.log("Resul " + result);


console.log("Resul " + addResult(10,20));