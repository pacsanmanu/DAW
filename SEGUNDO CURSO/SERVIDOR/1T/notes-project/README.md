# Proyecto notas

Proyecto para la gestión de notas a través de un servidor en ExpressJS. 

Para ver la documentación de la API, levantar el servidor y acceder a /**api-docs.**

#### Arquitectura


```
notes-project
├─ .editorconfig
├─ .env
├─ .eslintrc.json
├─ .vscode
│  └─ settings.json
├─ PostmanCollection.json
├─ PostmanEnvironment.json
├─ README.MD
├─ docker-compose.test.yml
├─ notes
├─ package-lock.json
├─ package.json
├─ src
│  ├─ app.js
│  ├─ config
│  │  └─ morgan.js
│  ├─ controllers
│  │  ├─ notes-controller.js
│  │  └─ users-controller.js
│  ├─ documentation
│  │  ├─ swagger.js
│  │  └─ swagger.json
│  ├─ index.js
│  ├─ loaders
│  │  ├─ express-loader.js
│  │  └─ index.js
│  ├─ middlewares
│  │  ├─ auth-middleware.js
│  │  ├─ error-middleware.js
│  │  └─ misc-middleware.js
│  ├─ routes
│  │  ├─ index.js
│  │  └─ notes.js
│  ├─ services
│  │  ├─ createNote.js
│  │  ├─ deleteNote.js
│  │  ├─ editNote.js
│  │  ├─ editNoteName.js
│  │  ├─ listNote.js
│  │  ├─ listNotes.js
│  │  ├─ login.js
│  │  └─ uploadNote.js
│  └─ utils
│     ├─ index.js
│     └─ logger.js
└─ test
   ├─ notes.test.js
   └─ sonar.js

```