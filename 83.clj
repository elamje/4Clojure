(ns eightythree)


(defn halftrue
  [& boos]
  (let [t (filter #(= true %) boos)
        f (filter #(= false %) boos)]
                 (if (and (< 0 (count t)) (< 0 (count f)))
                   true
                   false)))

(= false (truthy false false))
