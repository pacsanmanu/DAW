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
  },
};
export const plugins = [];