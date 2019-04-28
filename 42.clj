(ns fortytwo)

(= ((fn fact [x] (loop [x x res 1]
               (if (= x 1)
                 res
                 (recur (dec x) (* res x))))) 3) 6)
;; => true

;; factorial
(fn fact [x] (loop [x x res 1]
               (if (= x 1)
                 res
                 (recur (dec x) (* res x)))))
