(ns thirtyone)

(= (#(partition-by identity %) [:a :a :b :b :c]) '((:a :a) (:b :b) (:c)))
;; => true

;; pack together consecutive elements
(fn pack [x] (partition-by identity x))
