(ns prime-factors-kata.core)

(defn -main
  [& args]
  (println "Hello World"))

(defn find-prime-factors [n]
  (loop [n n primes [] factor 2]
    (cond (<= n 1) primes
      (= 0 (rem n factor)) (recur (/ n factor) (conj primes factor) factor)
      :else (recur n primes (inc factor)))))