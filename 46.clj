(ns fortysix)

(defn fliparg [f]
  #(f %2 %1))

(= 3 ((fliparg nth) 2 [1 2 3 4 5]))

