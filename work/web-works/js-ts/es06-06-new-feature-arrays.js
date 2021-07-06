const names = ["Bitan", "Sanjana", "Prateek", "Amit", "Aarsh"];

names.forEach( name => {
    console.log(name.charAt(0));
})

let firstChar = names.map(name => name.charAt(0));
console.log(firstChar);

// for finding position
console.log(names.indexOf("Bitan"));
console.log(names.findIndex(name => name.length === 4));
console.log(names.filter(name => name.length>=5));


