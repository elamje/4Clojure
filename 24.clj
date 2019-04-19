(ns twentyfour)

(= (#(reduce + %) [1 2 3]) 6)
;; => true

;; +, i.e. sum
#(reduce + %)
