export class player {

  constructor(name){
    this.name = name;
    this.position = 1;
    this.turn = false;
  }

  getName(){
    return this.name;
  }

  rollDice(){
    const diceRoll = Math.floor(Math.random() * 6) + 1;
    this.position += diceRoll;
    return diceRoll;
  }

  getPosition(){
    return this.position;
  }

  setPosition(num){
    this.position = num;
  }
}
