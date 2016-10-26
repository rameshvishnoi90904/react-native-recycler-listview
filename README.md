# react-native-recycler-listview

Custom Component for ListView in Android using RecyclerView

Installation
> git clone https://github.com/rameshvishnoi90904/react-native-recycler-listview.git

##step 1: In settings.gradle
```
include ':ReactNativeRecyclerListview'
project(':ReactNativeRecyclerListview').projectDir = new File(rootProject.projectDir, '../node_modules/react-native-recycler-listview/android')
```

##step 2: In android/app/build.gradle
```
dependencies {
compile project(':ReactNativeRecyclerListview')
}
```

##step 3: In MainApplication.java

```

import com.customlistview.ListViewPackage;


@Override protected List getPackages() {
  return Arrays.asList(
    new MainReactPackage(),
    new ListViewPackage()
  );
}

```
##step 4: In index.js
```javascript
import ListViewCustom from 'react-native-recycler-listview';

constructor(props) {
      super(props);
      var array = [];
      for(var i  = 0; i < 1000; i++){
        array.push({"title":"Title","subtitle":"subtiles"});
      }
      this.state = {
        dataSource:{"names": array}
      };
    }

render() {
  return (
    <View style={styles.container}>
      <ListViewCustom
      src={this.state.dataSource}
      customStyle={{"fontSize":"12","padding":"0","fontColor":"#ff6600"}}
      style={{flex:1,width:Dimensions.get('window').width,padding:0,margin:0}}>
      </ListViewCustom>
    </View>
  );
}
```
