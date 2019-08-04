server:
		clojure -A:nrepl -i

test:
		clojure -A:test

format:
		clojure -A:format

fix-format:
		clojure -A:format/fix

lint:
		clojure -A:eastwood

check:
		make format
		make lint
		make test


.PHONY: server test
