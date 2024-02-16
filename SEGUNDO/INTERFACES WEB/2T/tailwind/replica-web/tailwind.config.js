/** @type {import('tailwindcss').Config} */
export const content = ["./src/**/*.{html,js}"];
export const theme = {
  extend: {
    colors: {
      "primario": "#FF0000",
      "secundario": "#00FF00",
    },
    dropShadow: {
      "custom": "0 1px 3px rgba(0, 0, 0, 0.15)", // Updated shadow with smoother effect
    },
    screens: {
      "660": "660px",
      "724": "724px",
      "799": "799px",
      "899": "899px",
      "925": "925px",
      "970": "970px",
      "1080": "1080px",
      "1250": "1250px"
    }
  },
};
export const plugins = [];