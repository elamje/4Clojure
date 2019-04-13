(ns 14)

(= 8 ((fn add-five [x] (+ x 5)) 3) ((fn [x] (+ x 5)) 3) (#(+ % 5) 3) ((partial + 5) 3))
