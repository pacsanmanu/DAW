import { player } from './player.js'

let jugador = new player("Jugador");
let pc = new player("PC");

function gameStatus(req, res) {
  let status = `<strong>${jugador.getName()}:</strong> ${jugador.getPosition()}<br>` +
	`<strong>${pc.getName()}:</strong> ${pc.getPosition()}`;
  res.send(status);
}

function restartGame(req, res) {
  jugador = new player("Jugador");
  pc = new player("PC");
  res.send("El juego se ha reiniciado!");
}

function roll(req, res) {
  let aux = `El jugador ha sacado un <strong>${jugador.rollDice()}</strong><br>`;
  aux += `El ordenador ha sacado un <strong>${pc.rollDice()}</strong><br><br>`;

  aux += checkSpecialConditions(jugador);
  aux += checkSpecialConditions(pc);

  res.send(aux);
}

function checkSpecialConditions(player) {
  let aux = "";
  if(player.getPosition() === 63) {
    aux += `<strong>¡${player.getName()} ha ganado!</strong><br>`;
  } else {
    switch (player.getPosition()) {
      case 5:
        player.setPosition(9);
        aux += `${player.getName()} ha caído en la oca y avanza a la casilla ${player.getPosition()}<br>`;
        break;
      case 6:
        player.setPosition(12);
        aux += `${player.getName()} ha caído en el puente y avanza a la posición ${player.getPosition()}<br>`;
        break;
      case 9:
        player.setPosition(14);
        aux += `${player.getName()} ha caído en la oca y avanza a la casilla ${player.getPosition()}<br>`;
        break;
      case 12:
        player.setPosition(6);
        aux += `${player.getName()} ha caído en el puente y retrocede a la posición ${player.getPosition()}<br>`;
        break;
      case 58:
        player.setPosition(1);
        aux += `${player.getName()} ha caído en la muerte y vuelve al principio<br>`;
        break;
      default:
        if(player.getPosition() > 63) {
          const overshoot = player.getPosition() - 63;
          player.setPosition(63 - overshoot);
          aux += `${player.getName()} ha superado 63 y retrocede a la posición ${player.getPosition()}<br>`;
        } else {
          aux += `${player.getName()} avanza hasta la posición ${player.getPosition()}<br>`;
        }
        break;
    }
  }
  return aux;
}


export const functions = {
  gameStatus,
  restartGame,
  roll
};
