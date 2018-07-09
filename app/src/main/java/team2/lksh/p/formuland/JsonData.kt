package team2.lksh.p.formuland

import android.content.Context
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import java.io.*
import kotlin.reflect.KClass

class JsonDataProcessor(private val context: Context) {

    private lateinit var data: Array<Expression>
    private lateinit var const: Array<Const>
    init {
        data = jsonParse(R.raw.formula, Array<Expression>::class)
        const = jsonParse(R.raw.constant, Array<Const>::class)
    }

    private fun <T : Any> jsonParse(res: Int, clazz: KClass<Array<T>>): Array<T> {
        val gson = Gson()

        val inputStream = context.resources.openRawResource(res)
        val reader = BufferedReader(InputStreamReader(inputStream))

        var fileContent = ""
        val lines = reader.readLines()
        lines.forEach {
            fileContent += it
        }
        val typeToken = TypeToken.get(clazz.java)
        val data: Array<T> = gson.fromJson(fileContent, typeToken.type)
        return data
    }

    private class Expression(val name: String,
                             val expression: List<String>,
                             val type: String,
                             val image: String)

    private class Const(val name: String,
                        val value: Double)

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
     * getConstValue() returns value of const in Double type
     *
     **/

    fun getMenuData(type: String): MenuData {
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

    fun getImage(id: Int): String = data[id].image

    fun getExprVars(ind: Int): List<String> {
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

    fun getExpr(ind: Int): List<String> = data[ind].expression

    fun getConstValue(constName: String): Double? {
        for (obj in const)
            if (obj.name == constName) return obj.value
        return null
    }
}

enum class JsonTypes(value: String) {
    MathBase("math.base"),
    MathGeometry("math.geometry"),
    PhysicsBase("physics.base"),
    ChemistryBase("chemistry.base")
}