package com.zireddinismayilov.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.zireddinismayilov.calculator.databinding.ActivityMainBinding
import kotlin.math.roundToInt

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setUpListeners()
    }

    private fun setUpListeners() {
        binding.bt0.setOnClickListener {
            if (binding.result.text.toString().equals("0")) {
                binding.result.setText(binding.bt0.text)
            } else {
                binding.result.append(binding.bt0.text)
            }
        }

        binding.bt1.setOnClickListener {
            if (binding.result.text.toString().equals("0")) {
                binding.result.setText(binding.bt1.text)
            } else {
                binding.result.append(binding.bt1.text)
            }
        }

        binding.bt2.setOnClickListener {
            if (binding.result.text.toString().equals("0")) {
                binding.result.setText(binding.bt2.text)
            } else {
                binding.result.append(binding.bt2.text)
            }
        }

        binding.bt3.setOnClickListener {
            if (binding.result.text.toString().equals("0")) {
                binding.result.setText(binding.bt3.text)
            } else {
                binding.result.append(binding.bt3.text)
            }
        }

        binding.bt4.setOnClickListener {
            if (binding.result.text.toString().equals("0")) {
                binding.result.setText(binding.bt4.text)
            } else {
                binding.result.append(binding.bt4.text)
            }
        }

        binding.bt5.setOnClickListener {
            if (binding.result.text.toString().equals("0")) {
                binding.result.setText(binding.bt5.text)
            } else {
                binding.result.append(binding.bt5.text)
            }
        }

        binding.bt6.setOnClickListener {
            if (binding.result.text.toString().equals("0")) {
                binding.result.setText(binding.bt6.text)
            } else {
                binding.result.append(binding.bt6.text)
            }
        }

        binding.bt7.setOnClickListener {
            if (binding.result.text.toString().equals("0")) {
                binding.result.setText(binding.bt7.text)
            } else {
                binding.result.append(binding.bt7.text)
            }
        }

        binding.bt8.setOnClickListener {
            if (binding.result.text.toString().equals("0")) {
                binding.result.setText(binding.bt8.text)
            } else {
                binding.result.append(binding.bt8.text)
            }
        }

        binding.bt9.setOnClickListener {
            if (binding.result.text.toString().equals("0")) {
                binding.result.setText(binding.bt9.text)
            } else {
                binding.result.append(binding.bt9.text)
            }
        }

        //operations
        var count = 0
        while (count < 1) {
            binding.add.setOnClickListener {
                binding.result.append(binding.add.text)
                count++
            }

            binding.subtract.setOnClickListener {
                binding.result.append(binding.subtract.text)
                count++
            }

            binding.multiply.setOnClickListener {
                binding.result.append(binding.multiply.text)
                count++
            }

            binding.divide.setOnClickListener {
                binding.result.append(binding.divide.text)
                count++
            }
        }

        binding.reset.setOnClickListener {
            binding.result.setText("0")
        }

        binding.delete.setOnClickListener {
            if (binding.result.text.length > 1) {
                binding.result.setText(binding.result.text.subSequence(0, binding.result.text.length - 1))
            }
        }

        binding.calculate.setOnClickListener {

            val len = binding.result.text.length

            if ('+' in binding.result.text) {
                val idx = binding.result.text.indexOf('+')
                val res = binding.result.text.subSequence(0, idx).toString().toInt() + binding.result.text.subSequence(idx + 1, len).toString().toInt()
                binding.result.setText(res.toString())
            } else if ('-' in binding.result.text) {
                val idx = binding.result.text.indexOf('-')
                val res = binding.result.text.subSequence(0, idx).toString().toInt() - binding.result.text.subSequence(idx + 1, len).toString().toInt()
                binding.result.setText(res.toString())
            } else if ('x' in binding.result.text) {
                val idx = binding.result.text.indexOf('x')
                val res = binding.result.text.subSequence(0, idx).toString().toInt() * binding.result.text.subSequence(idx + 1, len).toString().toInt()
                binding.result.setText(res.toString())
            } else if ('/' in binding.result.text) {
                val idx = binding.result.text.indexOf('/')
                var res = binding.result.text.subSequence(0, idx).toString().toInt() / binding.result.text.subSequence(idx + 1, len).toString().toDouble()
                res = (res * 1000.0).roundToInt() / 1000.0
                binding.result.setText(res.toString())
            } else {
                Toast.makeText(this, "specify the operation!", Toast.LENGTH_SHORT).show()
            }

        }

    }

}