function cubeVolume(dimensions){
    return dimensions.width * dimensions.height * dimensions.length;
}

const dimensions = {
    width: 12,
    length: 3,
    height: 14
};

console.log(cubeVolume(dimensions));