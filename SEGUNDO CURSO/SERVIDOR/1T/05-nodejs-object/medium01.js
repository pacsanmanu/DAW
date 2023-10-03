function invert(object){
    const inverted = [];
    const keys = Object.keys(object);
    const values = Object.values(object);
    for (let index = 0; index < values.length; index++) {
        inverted.push([values[index], keys[index]])
    }
    return inverted;
}

const test = {
    name: "manuel",
    lastname1: "pacheco",
    lastname2: "sanchez"
}

console.log(invert(test));
