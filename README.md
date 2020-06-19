# Snat

A simple android library coded in Kotlin for showing **Toast** and **Snackbar**.

[![Release](https://jitpack.io/v/IronClad1607/Snat.svg)](https://jitpack.io/#IronClad1607/Snat)

## Examples

### Default Toast Message
<table align="center">
	<tr>
		<td>
			Toast with Short Duration
		</td>
		<td>
			Toast with Long Duration
		</td>
	</tr>
	<tr>
		<td>
			<img src="/readme gifs/toast short.gif" height="390" width="180">
		</td>
		<td><img src="/readme gifs/toast long.gif" height="390" width="180">
	</tr>
</table>

### Positional Toast Message
<table align="center">
	<tr>
		<td>
			Toast on Top of the Display
		</td>
		<td>
			Toast on Bottom of the Display
		</td>
    <td>
			Toast on Left of the Display
		</td>
		<td>
			Toast on Right of the Display
		</td>
	</tr>
	<tr>
		<td>
			<img src="/readme gifs/toast top.gif" height="390" width="180">
		</td>
		<td><img src="/readme gifs/toast bottom.gif" height="390" width="180">
      </td>
    <td>
			<img src="/readme gifs/toast left.gif" height="390" width="180">
		</td>
		<td><img src="/readme gifs/toast right.gif" height="390" width="180">
      </td>
	</tr>
</table>

## Library
  The library is inside the <a href="./snat">Snat</a> folder
  
## Sample
  The sample App is inside the <a href="./app">app</a> folder
  
## Implementing Snat

Implementing Snat is really simple. You have to just call the function according to your need.
 - **For Default Toast Message**
 
    ```kotlin
          SnatToast.toastDefault(context, message, duration)
     ```
    Parameter of the function
    - context: Context of the Activity.
    - message: Message you want to display. It should be a ***String*** type variable.
    - duration: For how much time you want to show the toast. A ***Integer*** which can be either **0** for Short Duration or **1** for Long Duration.
    
 - **For Positional Toast Message**
     ```kotlin
          SnatToast.positionedToast(context, message, duration, gravity, xOffSet, yOffSet)
     ```
    Parameter of the function
    - context: Context of the Activity.
    - message: Message you want to display. It should be a ***String*** type variable.
    - duration: For how much time you want to show the toast. A ***Integer*** which can be either **0** for Short Duration or **1** for Long Duration.
    - gravity: The position for Toast message. A ***Integer*** which can:
                <ul>
                    <li> <strong>1</strong> for positioning at <strong>TOP</strong></li>
                    <li> <strong>2</strong> for positioning at <strong>BOTTOM</strong></li>
                      <li> <strong>3</strong> for positioning at <strong>LEFT</strong></li>
                        <li> <strong>4</strong> for positioning at <strong>RIGHT</strong></li>
                </ul>
     - xOffSet: For setting margin X coordinate. A ***Integer*** type value.
     - yOffSet: For setting margin in Y coordinate. A ***Integer*** type value.

## How to add Snat to your Project
You can add Snat in your projects using jitpack maven disturbtion

### Steps
1. Add Maven Repository in **build.gradle** file (project-level).

   ```groovy
    repositories {
        jcenter()
        maven {
            url "https://jitpack.io"
        }
    }
    ```
2. Add dependency in **build.gradle** file (app-level)
   
    ```groovy
    dependencies {
       implementation 'com.github.IronClad1607:Snat:1.3'
    }
    ```

Made with :heart: by [@IronClad1607](https://github.com/IronClad1607)
