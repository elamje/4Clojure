(ns twentytwo)

(= (#(let [x % len 1] (loop [x x len len] (if (empty? (rest x)) len (recur (rest x) (inc len))))) '(1 2 3 3 1)) 5)
;; => true

;; count
;; function - doesn't handle count = 0
#(let [x % len 1] (loop [x x len len] (if (empty? (rest x)) len (recur (rest x) (inc len)))))

;; v2
(= ((fn [x] (reduce + (map #(if (nil? %) 0 1) x))) '(1 2 3 3 1)) 5)
;; => true

;; count v2
(fn [x] (reduce + (map #(if (nil? %) 0 1) x)))
