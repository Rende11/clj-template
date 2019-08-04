repl:
		clojure -A:nrepl -i

test:
		clojure -A:test

run:
		clojure -A:server

coverage:
		clojure -A:test-coverage

format:
		clojure -A:format

fix-format:
		clojure -A:format/fix

lint:
		clojure -A:eastwood

check:
		make format
		make lint
		make coverage


.PHONY: server test
