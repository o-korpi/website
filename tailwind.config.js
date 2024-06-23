/** @type {import('tailwindcss').Config} */
module.exports = {
  content: ["./src/main/resources/**/*.{html,js}"],
  theme: {
    fontFamily: {
        'default': ['Raleway', '"Segoe UI', 'ui-sans-serif', 'system-ui', 'sans-serif'],
    },
    extend: {
        colors: {
            'oxford-blue': '#112132',
            'indigo-dye': '#274268',
            'imperial-red': '#F03A47',
            'imperial-red-dark': '#AB0D17',
            'pale-azure': '#97DFFC'
        },
    },
  },
  plugins: [],
}

