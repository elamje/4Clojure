(ns onethirtyfive)

(defn calc [num op & args]
  (loop [result num op op next (first args) later (rest args)]
    (if (= later [])
      (op result next)
      (recur (op result next) (first later) (second later) (nthrest later 2)))))

(= 42 (calc 38 + 48 - 2 / 2))
