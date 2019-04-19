(ns twentyone)

(= (#(let [x %1 n %2] (loop [x x n n] (if (= n 0) (first x) (recur (rest x) (dec n))))) '(4 5 6 7) 2) 6)
;; => true

;; nth
#(let [x %1 n %2] (loop [x x n n] (if (= n 0) (first x) (recur (rest x) (dec n)))))
