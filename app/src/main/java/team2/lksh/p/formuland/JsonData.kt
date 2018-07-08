package team2.lksh.p.formuland

import android.content.Context
import android.util.Log
import com.google.gson.Gson
import java.io.*
import java.util.*


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

private class Expression(val name: String,
                         val expression: List<String>,
                         val type: String,
                         val image: String)


class JsonData {

    companion object {
        // const String data types
        const val mathBase = "math.base"
    }

}

class MenuData(val names: List<String>,
               val images: List<String>,
               val idList: List<Int>)

/**
 * All json data types:
 * -math.base
 *
 * getMenuData() returns MenuData object:
 * List of names, images, idList
 *
 * getExprVars() returns list of 1-symbol variables (String type)
 *
 * getExpr() returns list of all expressions in Strings
 *
 * getImage() returns image name in String format
 *
 **/

fun getMenuData(context: Context, type: String): MenuData {
    val data = jsonParse(context)
    val names: MutableList<String> = mutableListOf()
    val images: MutableList<String> = mutableListOf()
    val idList: MutableList<Int> = mutableListOf()
    for (i in 0 until data.size) {
        if (data[i].type == type) {
            names.add(data[i].name)
            images.add(data[i].image)
            idList.add(i)
        }
    }
    return MenuData(names, images, idList)
}

fun getImage(context: Context, id: Int): String = jsonParse(context)[id].image

fun getExprVars(context: Context, ind: Int): List<String> {
    val data = jsonParse(context)
    val res: MutableSet<String> = mutableSetOf()
    val expr = data[ind].expression[0]

    var i = 0

    while (i < expr.length) {
        if (expr[i] == '@') {
            i++
            var variable = ""
            while (expr[i] != '@') {
                variable += expr[i]
                i++
            }
            res.add(variable)
        }
        i++
    }
    return res.toList()
}

fun getExpr(context: Context, ind: Int): List<String> {
    val data = jsonParse(context)
    return data[ind].expression
}