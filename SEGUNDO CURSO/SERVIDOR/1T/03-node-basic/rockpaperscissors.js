const readline = require('readline');

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

const options = ['rock', 'paper', 'scissors'];
let userLife = 3;
let pcLife = 3;

function convert(option){
  return options[option];
}

function ask() {
  return new Promise((resolve) => {
    console.log("");
        rl.question('Options are: rock, paper, scissors. Which one do you want to choose?: ', (userOption) => {
          const option = userOption.trim().toLowerCase();
          if(options.includes(option)){
            resolve(option);
          }else{
            console.log("You didn't choose a right option.");
            resolve(ask());
          }
        });
    });
}

function round(userOption) {
  const pcOption = Math.floor(Math.random() * options.length);
  const convertedPcOption = convert(pcOption);

    if(userOption === 'rock'){
        if(convertedPcOption === 'rock'){
            console.log('Draw! You both used rock!');
        }else if(convertedPcOption === 'paper'){
            console.log('PC wins! He used paper and you used rock. You lose 1 life.');
            userLife--;
        }else if(convertedPcOption === 'scissors'){
            console.log('You win! You used rock and the PC used scissors. PC loses 1 life.');
            pcLife--;
        }
    }else if(userOption === 'paper'){
        if(convertedPcOption === 'rock'){
            console.log('You win! You used paper and the PC used rock. PC loses 1 life.');
            pcLife--;
        }else if(convertedPcOption === 'paper'){
            console.log('Draw! You both used paper');
        }else if(convertedPcOption === 'scissors'){
            console.log('PC wins! He used scissors and you used paper. You lose 1 life.');
            userLife--;
        }
    }else if(userOption === 'scissors'){
        if(convertedPcOption === 'rock'){
            console.log('PC wins! He used rock and you used scissors. You lose 1 life.');
            userLife--;
        }else if(convertedPcOption === 'paper'){
            console.log('You win! You used scissors and the PC used paper. PC loses 1 life.');
            pcLife--;
        }else if(convertedPcOption === 'scissors'){
            console.log('Draw! You both used paper');
        }
    }
}

async function startGame() {
  while (userLife > 0 && pcLife > 0) {
    const userOption = await ask();
    round(userOption);
  }

  rl.close();
}

console.log('Welcome to rock paper scissors');
startGame();
