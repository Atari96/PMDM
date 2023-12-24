package com.example.comidasactivity.modelo

data class DetalleComida (val id:Int,
                          val categoria: String,
                          val area: String,
                          val descripcion: String,
                          val receta: String,
                          var foto: String,
                          val ingr1: String,
                          val ingr2: String,
                          val ingr3: String,
                          val ingr4: String,
                          val ingr5: String,
                          val cantidad1: String,
                          val cantidad2: String,
                          val cantidad3: String,
                          val cantidad4: String,
                          val cantidad5: String
                        )