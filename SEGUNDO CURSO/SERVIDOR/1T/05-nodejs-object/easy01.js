function convertToArray(object){
    const converted = [];
    const keys = Object.keys(object);
    const values = Object.values(object);
    for (let index = 0; index < values.length; index++) {
        converted.push([keys[index], values[index]])
    }
    return converted;
}

const test = {
    name: "manuel",
    lastname1: "pacheco",
    lastname2: "sanchez"
}

console.log(convertToArray(test));
