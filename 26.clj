(ns twentysix)

(= (#(let [fib1 1 fib2 1 result [1 1]] (loop [fib1 fib1 fib2 fib2 result result] (if (= (count result) %) result (recur fib2 (+ fib1 fib2) (concat result [(+ fib1 fib2)] ))))) 3) '(1 1 2))
;; => true

;; Fibonacci
#(let [fib1 1 fib2 1 result [1 1]] (loop [fib1 fib1 fib2 fib2 result result] (if (= (count result) %) result (recur fib2 (+ fib1 fib2) (concat result [(+ fib1 fib2)] )))))
