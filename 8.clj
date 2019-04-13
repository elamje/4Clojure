(ns 8)

(= #{:a :b :c :d} (clojure.set/union #{:a :b :c} #{:b :c :d}) (set '(:a :a :b :c :c :c :c :d :d)))
