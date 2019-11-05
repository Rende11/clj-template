repl:
		clojure -A:test:nrepl -i

test:
		clojure -A:test

run:
		clojure -A:server

coverage:
		clojure -A:test:test-coverage

format:
		clojure -A:format

fix-format:
		clojure -A:format:format/fix

lint:
		clojure -A:eastwood

check:
		make format
		make lint
		make coverage

build:
		clojure -A:uberjar

jar-run:
		java -cp target/clj-template.jar clojure.main -m clj-template.core


.PHONY: server test
