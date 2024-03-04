package com.pmp.pmpcoctailapp.model

data class DetalleCocktail (val id:Int,
                            val categoria: String,
                            val nombre: String,
                            var foto: String,
                            val receta: String,
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