(ns sixtytwo)

(fn foo [f x]
  (loop [f f x x]
    (recur f (cons (f x)))))
