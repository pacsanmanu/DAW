document.getElementById('roll-button').addEventListener('click', () => {
  fetch('/roll')
    .then(response => response.text())
    .then(data => {
      document.getElementById('status').innerHTML = data.replace(/\n/g, '<br>');
    });
});

document.getElementById('restart-button').addEventListener('click', () => {
  fetch('/restartGame')
    .then(response => response.text())
    .then(data => {
      document.getElementById('status').textContent = data;
    });
});

window.onload = () => {
  fetch('/status')
    .then(response => response.text())
    .then(data => {
      document.getElementById('status').innerHTML = data.replace(/\n/g, '<br>');
    });
};
