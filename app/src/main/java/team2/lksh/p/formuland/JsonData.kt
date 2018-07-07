package team2.lksh.p.formuland

import android.content.Context
import com.google.gson.Gson
import java.io.*

private fun jsonParse(context: Context): Array<Expression> {
    val gson = Gson()

    val inputStream = context.resources.openRawResource(R.raw.formula)
    val reader = BufferedReader(InputStreamReader(inputStream))

    var fileContent = ""
    val lines = reader.readLines()
    lines.forEach {
        fileContent += it
    }
    val data = gson.fromJson(fileContent, Array<Expression>::class.java)
    return data
}

// test comment for test commit

private class Expression(val name: String,
                         val expression: List<String>,
                         val type: String,
                         val image: String)


class MenuData(val names: List<String>,
               val images: List<String>,
               val indices: List<Int>)

/**
 * All json data types:
 * -math.base
 *
 * getMenuData() returns MenuData object:
 * List of names, images, indices
 *
 * getExprVars() returns list of 1-symbol variables (String type)
 *
 * getExpr() returns list of all expressions in Strings
 *
 **/

fun getMenuData(context: Context, type: String): MenuData {
    val data = jsonParse(context)
    val names: MutableList<String> = mutableListOf()
    val images: MutableList<String> = mutableListOf()
    val indices: MutableList<Int> = mutableListOf()
    for (i in 0 until data.size) {
        if (data[i].type == type) {
            names.add(data[i].name)
            images.add(data[i].image)
            indices.add(i)
        }
    }
    return MenuData(names, images, indices)
}

fun getExprVars(context: Context, ind: Int): List<String> {
    val data = jsonParse(context)
    val res: MutableSet<String> = mutableSetOf()
    var i = 0
    val expr = data[ind].expression[0]
    while (i < expr.length) {
        if (expr[i] == '@') {
            var variable = ""
            while (expr[i] != '@') {
                variable += data[ind].expression[0]
                i++
            }
        }
        i++
    }
    return res.toList()
}

fun getExpr(context: Context, ind: Int): List<String> {
    val data = jsonParse(context)
    return data[ind].expression
}