package com.example.actividad44

import android.app.AlertDialog
import android.app.Dialog
import android.os.Bundle
import android.widget.EditText
import androidx.core.os.bundleOf
import androidx.fragment.app.DialogFragment

class Fragmento_cambiar {
    class CambioImporteDialogFragment : DialogFragment() {
        override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
            var view=layoutInflater.inflate(R.layout.fragment_layout, null)
            var dialog:Dialog=AlertDialog.Builder(requireContext())
                .setView(view)
                .setMessage(getString(R.string.order_confirmation))
                .setPositiveButton(getString(R.string.ok)) { _, _ ->
                    var importeEditText: EditText =view.findViewById(R.id.editTextFragment)
                    var importe=importeEditText.text.toString()
                    parentFragmentManager.setFragmentResult("requestKey", bundleOf("importeKey" to importe))
                }
                .setNegativeButton(getString(R.string.CANCELAR)) { _, _ -> dismiss()}
                .create()
            return dialog
        }
        companion object {
            const val TAG = "CambioImporteDialog"
        }
    }
}