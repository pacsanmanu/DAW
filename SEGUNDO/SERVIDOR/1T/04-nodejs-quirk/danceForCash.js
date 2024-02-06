const moves = ["Shimmy", "Shake", "Pirouette", "Slide", "Box Step", "Headspin", "Dosado", "Pop", "Lock", "Arabesque"];

function danceConvert(pin) {
    if(isNaN(pin)){
        console.log("Pin is not a number");
        return false;
    }
    let acumulator;
    const digits = [...pin];
    const dance = [];
    digits.every((digit, index) => {
        acumulator = parseInt(digit) + index;
        while(acumulator > 9){
                acumulator -= 10;
        }
        dance.push(moves[acumulator]);
        return true;    
    });

    console.log('Dance Convert --> from ' + digits + ' to ' + dance);
}

danceConvert(process.argv[2]);