(ns twentyeight)

;; flatten - come back and try to redo this in diff format, this was taken from stack overflow
(defn flatman [x]
  (if (sequential? x)
    (mapcat flatman x)
    (list x)))

(= (flatman '((1 2) 3 [4 [5 6]])) '(1 2 3 4 5 6))
;; => true
