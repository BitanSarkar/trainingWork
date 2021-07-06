let nums = [45,65,68,32,384]
console.log(nums);
let newnums = [56,78,...nums]
console.log(newnums);

let address = {city:"Bengaluru", pin:"560053"}
let employee = {name:"Bitan", email:"bitan@fgs.com", address}

console.log(address);
console.log(employee);

let employee2 = {...employee};

console.log(employee===employee2);