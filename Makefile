server:
		clojure -A:nrepl -i

test:
		clojure -A:test

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
