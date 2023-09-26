const readline = require('readline');

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

function ask() {
  return new Promise((resolve) => {
    rl.question("I'm thinking about a number... Can you guess it?: ", (userInput) => {
      const usernumber = parseInt(userInput);
      if (!isNaN(usernumber)) {
        resolve(usernumber);
      } else {
        console.log("You didn't choose a number. Please enter a valid number.");
        ask().then(resolve); // Re-ask for input if it's not a number
      }
    });
  });
}

async function startGame() {
  const secretnumber = parseInt(Math.random() * 100);
  let usernumber = -1;

  while (secretnumber !== usernumber) {
    console.log("");
    usernumber = await ask();
    if (usernumber < secretnumber) {
      console.log("The number is lower than the PC number");
    } else if (usernumber > secretnumber) {
      console.log("The number is higher than the PC number");
    } else {
      console.log("Congratulations! You guessed the correct number!");
    }
  }

  rl.close();
}

startGame();
