(ns onehundredseven)

(= 256 ((closure 2) 16), ((closure 8) 2))

(defn closure
  [n]
  (fn [x]
    (loop [n n
           res 1]
      (if (zero? n )
        res
        (recur (dec n) (* res x))))))
