# Clojure web application template
---
[![Build Status](https://travis-ci.org/Rende11/clj-template.svg?branch=master)](https://travis-ci.org/Rende11/clj-template)

[![codecov](https://codecov.io/gh/Rende11/clj-template/branch/master/graph/badge.svg)](https://codecov.io/gh/Rende11/clj-template)

## Basics
* managing dependencies with ```deps.edn```
* ```http-kit``` web server
* ```nrepl/cider``` for comfortable developer expirience
* simple ```route-map``` routing
* ```kaocha``` tests
* linter ```eastwood``` and code-style checker ```cljfmt```
* CI ```travis-ci```
* test coverage with ```cloverage``` and ```codecov```

## Future plans
* forking with db (entities, migrations, connections)
* environment variables
* dockerize
* heroku deploy

## Launch example fore develop
* run interactive REPL ```make repl```
* connect to them from your editor (spacemacs - my choise)
* open ```clj-template.core``` and eval namespace and ```-main``` function
* now application available on http://localhost:8080

### Just launch app
* run server ```make run```
* now application available on http://localhost:8080
* your are awesome


