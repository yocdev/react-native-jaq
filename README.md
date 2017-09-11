
# react-native-jaq

## Getting started

`$ npm install react-native-jaq --save`

### Mostly automatic installation

`$ react-native link react-native-jaq`

### Manual installation


#### iOS

1. In XCode, in the project navigator, right click `Libraries` ➜ `Add Files to [your project's name]`
2. Go to `node_modules` ➜ `react-native-jaq` and add `RNJaq.xcodeproj`
3. In XCode, in the project navigator, select your project. Add `libRNJaq.a` to your project's `Build Phases` ➜ `Link Binary With Libraries`
4. Run your project (`Cmd+R`)<

#### Android

1. Open up `android/app/src/main/java/[...]/MainActivity.java`
  - Add `import me.youchai.reactnative.jaq.RNJaqPackage;` to the imports at the top of the file
  - Add `new RNJaqPackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-jaq'
  	project(':react-native-jaq').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-jaq/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':react-native-jaq')
  	```


## Usage
```javascript
import RNJaq from 'react-native-jaq';

// TODO: What to do with the module?
RNJaq;
```
  