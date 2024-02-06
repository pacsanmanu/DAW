function convertToArray(object){
    return [Object.keys(object), Object.values(object)];
}

const test = {
    name: "manuel",
    lastname1: "pacheco",
    lastname2: "sanchez"
}

console.log(convertToArray(test));
