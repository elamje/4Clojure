(ns twentyeight)

;; flatten
(fn flatman [x]
  (if (sequential? s)
    (mapcat flatman s)
    (list s)))
